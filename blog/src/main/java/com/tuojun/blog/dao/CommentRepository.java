package com.tuojun.blog.dao;

import com.tuojun.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Author:TuoJun
 * Date:2019-10-24 23:45
 * Description:(描述)
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);

    void deleteByBlogId(Long id);

}
