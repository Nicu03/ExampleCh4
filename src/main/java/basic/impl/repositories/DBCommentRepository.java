package basic.impl.repositories;

import basic.impl.pojo.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Comment "+ comment.toString() + " was stored;");
    }
}
