package cn.shishuihao.thirdparty.api.push.xiaomi.api;

import cn.shishuihao.thirdparty.api.core.ApiException;
import cn.shishuihao.thirdparty.api.core.exception.PropertiesNotFoundException;
import cn.shishuihao.thirdparty.api.core.PropertiesRepository;
import cn.shishuihao.thirdparty.api.push.api.PushMessageApi;
import cn.shishuihao.thirdparty.api.push.request.PushMessageRequest;
import cn.shishuihao.thirdparty.api.push.response.PushMessageResponse;
import cn.shishuihao.thirdparty.api.push.xiaomi.XiaomiPushProperties;
import com.xiaomi.xmpush.server.Constants;
import com.xiaomi.xmpush.server.Message;
import com.xiaomi.xmpush.server.Result;
import com.xiaomi.xmpush.server.Sender;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author shishuihao
 * @version 1.0.0
 */

public class XiaomiPushMessageApi implements PushMessageApi {
    private final PropertiesRepository propertiesRepository;

    public XiaomiPushMessageApi(PropertiesRepository propertiesRepository) {
        this.propertiesRepository = propertiesRepository;
    }

    @Override
    public PushMessageResponse execute(PushMessageRequest request) {
        XiaomiPushProperties properties = (XiaomiPushProperties) propertiesRepository.getById(request.getPropertiesId())
                .orElseThrow(() -> new PropertiesNotFoundException("properties not found"));
        Constants.useOfficial();
        Sender sender = new Sender(properties.getAppSecretKey());
        Message message = new Message.Builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .payload(request.getPayload())
                .restrictedPackageName(request.getRestrictedPackageName())
                // 使用默认提示音提示
                .notifyType(1)
                .build();
        try {
            Result result = sender.send(message, Arrays.asList(request.getRegistrationIds()), 3);
            return PushMessageResponse.Builder.builder()
                    .code(String.valueOf(result.getErrorCode()))
                    .message(result.getReason())
                    .requestId(result.getMessageId())
                    .build();
        } catch (IOException | ParseException e) {
            throw new ApiException(e);
        }
    }
}