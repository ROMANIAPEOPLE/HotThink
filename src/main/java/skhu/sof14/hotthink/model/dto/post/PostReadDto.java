package skhu.sof14.hotthink.model.dto.post;

import lombok.Setter;
import lombok.ToString;
import skhu.sof14.hotthink.model.dto.user.UserPostDto;

import java.time.LocalDateTime;

@Setter
@ToString
public final class PostReadDto extends PostBase{
    String title;
    String content;
    int hit;
    int like;
    LocalDateTime createDate;
    String type;
    UserPostDto user;
}
