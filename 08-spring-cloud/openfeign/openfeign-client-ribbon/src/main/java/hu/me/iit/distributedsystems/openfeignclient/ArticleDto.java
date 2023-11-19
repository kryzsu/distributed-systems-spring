package hu.me.iit.distributedsystems.openfeignclient;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

public class ArticleDto {
    @NotNull
    private Long id;
    @NotNull
    @NotBlank
    private String author;
    @NotBlank
    private String title;
    @Min(10)
    private Integer pages;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleDto that = (ArticleDto) o;
        return id.equals(that.id) && author.equals(that.author) && title.equals(that.title) && pages.equals(that.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title, pages);
    }
}
