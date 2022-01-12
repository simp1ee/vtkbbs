package pub.developers.forum.facade.impl;

import org.springframework.stereotype.Service;
import pub.developers.forum.common.model.PageRequestModel;
import pub.developers.forum.common.model.PageResponseModel;
import pub.developers.forum.common.model.ResultModel;
import pub.developers.forum.common.request.AdminBooleanRequest;
import pub.developers.forum.common.request.tag.TagCreateRequest;
import pub.developers.forum.common.request.tag.TagPageRequest;
import pub.developers.forum.common.response.tag.TagPageResponse;
import pub.developers.forum.common.response.tag.TagQueryResponse;
import pub.developers.forum.api.service.TagApiService;
import pub.developers.forum.common.vo.PostsVO;
import pub.developers.forum.app.manager.TagManager;
import pub.developers.forum.common.support.CheckUtil;
import pub.developers.forum.facade.support.ResultModelUtil;
import pub.developers.forum.facade.validator.ArticleValidator;
import pub.developers.forum.facade.validator.PageRequestModelValidator;
import pub.developers.forum.facade.validator.TagValidator;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * @author Qiangqiang.Bian
 * @create 20/7/30
 * @desc
 **/
@Service
public class TagApiServiceImpl implements TagApiService {

    @Resource
    private TagManager tagManager;

    @Override
    public ResultModel<List<TagQueryResponse>> queryAllRef() {
        return ResultModelUtil.success(tagManager.queryAllRef());
    }

    @Override
    public ResultModel create(TagCreateRequest request) {
        TagValidator.create(request);

        tagManager.create(request);

        return ResultModelUtil.success();
    }

    @Override
    public ResultModel<TagQueryResponse> getByName(String name) {
        return ResultModelUtil.success(tagManager.getByName(name));
    }

    @Override
    public ResultModel<List<TagQueryResponse>> queryAll() {
        return ResultModelUtil.success(tagManager.queryAll());
    }

    @Override
    public ResultModel<List<TagQueryResponse>> queryInIds(Set<Long> ids) {
        CheckUtil.checkParamToast(ids, "ids");

        return ResultModelUtil.success(tagManager.queryInIds(ids));
    }

    @Override
    public ResultModel<PageResponseModel<PostsVO>> pagePosts(PageRequestModel<Long> pageRequestModel) {
        PageRequestModelValidator.validator(pageRequestModel);

        return ResultModelUtil.success(tagManager.pagePosts(pageRequestModel));
    }

    @Override
    public ResultModel<PageResponseModel<PostsVO>> pagePostsByTagIds(PageRequestModel<Set<Long>> pageRequestModel) {
        PageRequestModelValidator.validator(pageRequestModel);

        return ResultModelUtil.success(tagManager.pagePostsByTagIds(pageRequestModel));
    }

    @Override
    public ResultModel<PageResponseModel<TagPageResponse>> page(PageRequestModel<TagPageRequest> pageRequestModel) {
        PageRequestModelValidator.validator(pageRequestModel);

        return ResultModelUtil.success(tagManager.page(pageRequestModel));
    }

    @Override
    public ResultModel auditState(AdminBooleanRequest booleanRequest) {
        ArticleValidator.validatorBooleanRequest(booleanRequest);

        tagManager.tagAuditState(booleanRequest);

        return ResultModelUtil.success();
    }
}
