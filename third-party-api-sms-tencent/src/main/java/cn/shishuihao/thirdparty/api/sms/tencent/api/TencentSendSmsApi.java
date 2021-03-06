package cn.shishuihao.thirdparty.api.sms.tencent.api;

import cn.shishuihao.thirdparty.api.sms.api.SendSmsApi;
import cn.shishuihao.thirdparty.api.sms.request.SendBatchSmsApiRequest;
import cn.shishuihao.thirdparty.api.sms.request.SendSmsApiRequest;
import cn.shishuihao.thirdparty.api.sms.response.SendBatchSmsApiResponse;
import cn.shishuihao.thirdparty.api.sms.response.SendSmsApiResponse;

import java.util.Collections;

/**
 * @author shishuihao
 * @version 1.0.0
 */

public class TencentSendSmsApi implements SendSmsApi {
    private final TencentSendBatchSmsApi tencentSendBatchSmsApi;

    public TencentSendSmsApi(TencentSendBatchSmsApi tencentSendBatchSmsApi) {
        this.tencentSendBatchSmsApi = tencentSendBatchSmsApi;
    }

    @Override
    public SendSmsApiResponse execute(SendSmsApiRequest request) {
        SendBatchSmsApiRequest smsRequest = SendBatchSmsApiRequest.Builder.builder()
                .channelId(request.channelId())
                .propertiesId(request.getPropertiesId())
                .templateId(request.getTemplateId())
                .messages(Collections.singletonList(request.getMessage()))
                .build();
        SendBatchSmsApiResponse sendBatchSmsResponse = tencentSendBatchSmsApi.execute(smsRequest);
        return SendSmsApiResponse.Builder.builder()
                .requestId(sendBatchSmsResponse.getRequestId())
                .success(sendBatchSmsResponse.isSuccess())
                .code(sendBatchSmsResponse.getSendStatuses()[0].getCode())
                .message(sendBatchSmsResponse.getSendStatuses()[0].getMessage())
                .build();
    }
}
