package pub.developers.forum.api.service;

import pub.developers.forum.common.model.PageRequestModel;
import pub.developers.forum.common.model.PageResponseModel;
import pub.developers.forum.common.model.ResultModel;
import pub.developers.forum.common.request.message.MessagePageRequest;
import pub.developers.forum.common.response.message.MessagePageResponse;

/**
 * @author Qiangqiang.Bian
 * @create 20/7/30
 * @desc
 **/
public interface MessageApiService {

    ResultModel<PageResponseModel<MessagePageResponse>> page(PageRequestModel<MessagePageRequest> request);

    ResultModel markIsRead(Long messageId);

    ResultModel<Long> countUnRead();

}
