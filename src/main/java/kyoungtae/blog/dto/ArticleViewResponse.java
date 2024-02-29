package kyoungtae.blog.dto;

import kyoungtae.blog.domain.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;

    public ArticleViewResponse(Article article){
        this.id = getId();
        this.title = getTitle();
        this.content = getContent();
        this.createdAt = getCreatedAt();
    }
}
