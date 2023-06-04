package spring.impl.proxies;

import spring.impl.pojo.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
