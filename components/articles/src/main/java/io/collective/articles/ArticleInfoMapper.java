package io.collective.articles;

public final class ArticleInfoMapper {

    private ArticleInfoMapper() {

    }

    public static ArticleInfo map(ArticleRecord source) {
        return new ArticleInfo(source.getId(), source.getTitle());
    }
}
