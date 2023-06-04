package spring.impl.repositories;

import org.springframework.stereotype.Component;
import spring.impl.pojo.Comment;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Comment "+ comment.toString() + " was stored;");
    }
}
