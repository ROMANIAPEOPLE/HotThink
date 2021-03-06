package skhu.sof14.hotthink.model.dto.comment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import skhu.sof14.hotthink.model.dto.user.UserPostDto;
import skhu.sof14.hotthink.model.entity.Like;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@ToString
public class CommentReadDto extends CommentBase {
    String content;
    int likeList;
    @Getter
    UserPostDto user;
    boolean status;
    LocalDateTime dateTime;

    public void setLikeList(List<Like> likeList){
        this.likeList = likeList == null? 0 : likeList.size();
    }

    boolean userLikeStatus;
}
