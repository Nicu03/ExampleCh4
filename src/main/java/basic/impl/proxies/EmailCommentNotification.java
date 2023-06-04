package basic.impl.proxies;

import basic.impl.pojo.Comment;

public class EmailCommentNotification implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Comment "+ comment.toString() + " was sent;");
    }
}
