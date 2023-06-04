package spring.impl.proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import spring.impl.pojo.Comment;

@Component
@Primary
public class EmailCommentNotification implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Comment "+ comment.toString() + " was sent;");
    }
}
