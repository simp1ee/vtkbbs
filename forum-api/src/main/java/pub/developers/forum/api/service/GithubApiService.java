package pub.developers.forum.api.service;

import pub.developers.forum.common.model.ResultModel;
import pub.developers.forum.common.request.github.GithubOauthLoginRequest;

/**
 * @author Qiangqiang.Bian
 * @create 2021/5/15
 * @desc
 **/
public interface GithubApiService {

    ResultModel<String> oauthLogin(GithubOauthLoginRequest request);

}
