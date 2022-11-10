package com.ssafy.theme.service;

import com.ssafy.theme.dto.theme.*;
import com.ssafy.theme.entity.UserTheme;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ThemeService {
    int registTheme(ThemeRegistDto themeRegistDto,int userIdx);
    int createUserTheme(int userIdx, UserThemeRegistDto userThemeRegistDto);
    List<UserThemeDto> getThemeList(int user_id);
    ResponseEntity<?> getUserInfo(String nickname);

    ResponseEntity<?> getUserIdxInfo(int userIdx);

    List<PublicThemeDto> getPublicThemeList(int sort, int pageSize, int pageIdx);
    List<SearchThemeDto> searchTheme(String target,int userIdx);

    void scrapTheme(int user_id, int theme_idx);

    List<UserThemeDto> followThemeList(UserThemeIdxDto userThemeIdxDto);

    List<PublicThemeDto> getBookmarkThemeList(int userIdx);
    List<String> liveSearchTheme(String value);

    String getThemeName(int theme_idx);

    Map<String, Object> searchThemeInfo(String value, int userIdx);

    List<UserThemeDtoWithMSA> getThemeUserList(int theme_idx);

    void deleteScrapTheme(int user_id, int theme_idx);

    List<RecommendDto> getRecommendThemeList();

    List<UserThemeDto> getUserThemeByUserIdx(int user_idx);

    int getThemeOpenType(int followUserIdx, int followThemeIdx);
    BoardInfoDto boardInfoByTheme(int themeIdx);

    ThemeDto getPublicThemeDetail(int theme_idx);

    int isUserTheme(int userIdx, int themeIdx);

    int whoUserIdx(int userThemeIdx);
}
