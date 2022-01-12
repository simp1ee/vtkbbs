package pub.developers.forum.api.service;

import pub.developers.forum.common.model.PageRequestModel;
import pub.developers.forum.common.model.PageResponseModel;
import pub.developers.forum.common.model.ResultModel;
import pub.developers.forum.common.request.comment.CommentCreateRequest;
import pub.developers.forum.common.response.comment.CommentPageResponse;

/**
 * @author Qiangqiang.Bian
 * @create 2020/11/6
 * @desc
 **/
public interface CommentApiService {

    ResultModel create(CommentCreateRequest request);

    ResultModel<PageResponseModel<CommentPageResponse>> page(PageRequestModel<Long> pageRequest);

}
