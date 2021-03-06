package cn.shishuihao.thirdparty.api.sms.request;

import cn.shishuihao.thirdparty.api.core.request.AbstractRequest;
import cn.shishuihao.thirdparty.api.sms.SmsApiRequest;
import cn.shishuihao.thirdparty.api.sms.api.SendSmsApi;
import cn.shishuihao.thirdparty.api.sms.domain.SmsMessage;
import cn.shishuihao.thirdparty.api.sms.response.SendSmsApiResponse;

/**
 * @author shishuihao
 * @version 1.0.0
 */
public class SendSmsApiRequest extends AbstractRequest<SendSmsApi, SendSmsApiRequest, SendSmsApiResponse>
        implements SmsApiRequest<SendSmsApi, SendSmsApiRequest, SendSmsApiResponse> {
    /**
     * template Id
     */
    private final String templateId;
    /**
     * message
     */
    private final SmsMessage message;

    protected SendSmsApiRequest(String channelId, String propertiesId, String templateId, SmsMessage message) {
        super(channelId, propertiesId);
        this.templateId = templateId;
        this.message = message;
    }

    public String getTemplateId() {
        return templateId;
    }

    public SmsMessage getMessage() {
        return message;
    }

    @Override
    public Class<SendSmsApi> apiType() {
        return SendSmsApi.class;
    }

    @Override
    public Class<SendSmsApiResponse> responseType() {
        return SendSmsApiResponse.class;
    }

    public static final class Builder {
        private String channelId;
        private String propertiesId;
        private String templateId;
        private SmsMessage message;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        public Builder propertiesId(String propertiesId) {
            this.propertiesId = propertiesId;
            return this;
        }

        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public Builder message(SmsMessage message) {
            this.message = message;
            return this;
        }

        public SendSmsApiRequest build() {
            return new SendSmsApiRequest(channelId, propertiesId, templateId, message);
        }
    }
}
