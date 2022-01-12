package pub.developers.forum.api.service;

import pub.developers.forum.common.model.PageRequestModel;
import pub.developers.forum.common.model.PageResponseModel;
import pub.developers.forum.common.model.ResultModel;
import pub.developers.forum.common.request.AdminBooleanRequest;
import pub.developers.forum.common.request.tag.TagCreateRequest;
import pub.developers.forum.common.request.tag.TagPageRequest;
import pub.developers.forum.common.response.tag.TagPageResponse;
import pub.developers.forum.common.response.tag.TagQueryResponse;
import pub.developers.forum.common.vo.PostsVO;

import java.util.List;
import java.util.Set;

/**
 * @author Qiangqiang.Bian
 * @create 20/7/30
 * @desc
 **/
public interface TagApiService {

    ResultModel<List<TagQueryResponse>> queryAllRef();

    ResultModel create(TagCreateRequest request);

    ResultModel<TagQueryResponse> getByName(String name);

    ResultModel<List<TagQueryResponse>> queryAll();

    ResultModel<List<TagQueryResponse>> queryInIds(Set<Long> ids);

    ResultModel<PageResponseModel<PostsVO>> pagePosts(PageRequestModel<Long> pageRequestModel);

    ResultModel<PageResponseModel<PostsVO>> pagePostsByTagIds(PageRequestModel<Set<Long>> pageRequestModel);

    ResultModel<PageResponseModel<TagPageResponse>> page(PageRequestModel<TagPageRequest> pageRequestModel);

    ResultModel auditState(AdminBooleanRequest booleanRequest);
}
