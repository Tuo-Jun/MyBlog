package com.tuojun.blog.service;

import com.tuojun.blog.po.Comment;

import java.util.List;

/**
 * Author:TuoJun
 * Date:2019-10-24 23:43
 * Description:(描述)
 */
public interface CommentService {

    List<Comment> listCommentByBlogId (Long blogId);

    Comment saveComment(Comment comment);
}
