package pub.developers.forum.api.service;

import pub.developers.forum.common.model.PageRequestModel;
import pub.developers.forum.common.model.PageResponseModel;
import pub.developers.forum.common.model.ResultModel;
import pub.developers.forum.common.request.AdminBooleanRequest;
import pub.developers.forum.common.vo.PostsVO;

/**
 * @author Qiangqiang.Bian
 * @create 2020/11/25
 * @desc
 **/
public interface PostsApiService {

    ResultModel delete(Long id);

    ResultModel<PageResponseModel<PostsVO>> pagePostsFood(PageRequestModel pageRequestModel);

    ResultModel auditState(AdminBooleanRequest booleanRequest);
}
