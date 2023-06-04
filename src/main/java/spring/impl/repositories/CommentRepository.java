package spring.impl.repositories;

import spring.impl.pojo.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
