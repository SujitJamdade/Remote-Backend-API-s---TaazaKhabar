package com.example.TazaaKhabar.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewsResponse {

    String status;
    List<ArticleResponse> articles;
}
