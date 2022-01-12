package pub.developers.forum.api.service;

import pub.developers.forum.common.model.PageRequestModel;
import pub.developers.forum.common.model.PageResponseModel;
import pub.developers.forum.common.model.ResultModel;
import pub.developers.forum.common.vo.PostsVO;

/**
 * @author Qiangqiang.Bian
 * @create 2020/12/2
 * @desc
 **/
public interface SearchApiService {

    ResultModel<PageResponseModel<PostsVO>> pagePostsSearch(PageRequestModel<String> pageRequestModel);

}
