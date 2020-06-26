HotThink 설계서
==============================

## 개요
현재 다른 사람들의 아이디어를 참고할 수 있는 플랫폼이 부족하다고 생각하고 나아가 자신만의 좋은 아이디어를 팔 수 있기까지 가능한 사이트를 구현하고자 기획하게 되었다.
HotThink 사이트는 다른 아이디어 판매 사이트와 다르게 커뮤니티 서비스를 접목시켜 한 사람이 판매하는 아이디어가 다른 사람들과의 검토를 통해 검증된 아이디어임을 나타내고자 좋아요 기능과 프리띵크, 핫띵크, 리얼띵크의 세 단계 게시판을 제공한다. 또한 사용자들은 거래가 완료된 이 후 거래자의 평가를 통해 자신만의 경쟁력을 가질 수 있는 평점 시스템과 관심 있는 사용자가 작성한 글만 볼 수 있는 팔로우 기능, 그리고 거래자와 소통할 수 있게 쪽지 기능을 제공한다.

## 주요 기능 목록
로그인
회원 가입
회원 정보 수정
회원 탈퇴
프리띵크 쓰기
프리띵크 읽기
프리띵크 수정
프리띵크 삭제
핫띵크 읽기
리얼띵크 쓰기
리얼띵크 읽기
리얼띵크 수정
리얼띵크 삭제
리얼띵크 구매
프리띵크 좋아요
프리띵크 댓글 달기
댓글 좋아요
리얼띵크 거래 후 판매자 평가(거래완료)
거래완료 목록 페이지
회원 팔로우
회원 신고
쪽지
알림
포인트 충전
포인트 출금
통합검색
QNA

## 주요 기능 상세 및 요구사항

##### 로그인
회원 사용자가 이메일과 비밀번호를 입력하여 로그인을 수행한다.
##### 회원가입
1. 사이트 이용약관(개인정보 취급 방침 등)에 동의한다.
2. 구글, 네이버 계정이 있을 경우 연동한다.
3. 유저 정보 입력한다. 타 SNS 계정을 연동했을 경우 자동으로 정보를 채워줌
- 유저정보에는 ID로 쓸 이메일, 비밀번호, 닉네임, 이름, 전화번호를 입력
- 비밀번호와 비밀번호 확인의 두 개의 란을 이용하여 한 번 확인한다.
- 비밀번호는 \****와 같이 나타냄
- 닉네임 중복검사를 통해 닉네임을 중복을 확인한다.
- 타 SNS 계정 연동 안했을 시 이메일 인증 과정을 거친 뒤 회원가입 성공
##### 회원 정보 수정
사용자가 마이페이지에서 변경할 닉네임이 이미 존재한 닉네임인지만 검사 후 정보 수정
##### 회원 탈퇴
사용자가 회원 탈퇴를 원하는 경우 마이페이지에서 회원탈퇴를 진행한다.
회원탈퇴 과정은 회원탈퇴 처리 방침을 보여준 후 당사자의 동의를 얻은 뒤 탈퇴를 수행한다.
회원정보 보존 기간이 지난 뒤 당사자의 모든 활동 기록를 삭제하고 DB에는 이름을 none으로 변경
##### 프리띵크 쓰기
일반 사용자가 자신이 생각하는 아이디어를 프리띵크 게시판에 작성
게시글 작성에는 게시글 제목과 내용이 있다.
##### 프리띵크 읽기
프리띵크 게시글 목록에는 제목, 작성자의 닉네임, 좋아요 개수, 조회수, 작성 날짜로 구성된 게시글들이 나열되어 있다.
읽고 싶은 게시글을 클릭하여 해당 게시글 페이지로 넘어간다.
해당 게시글 페이지에는 제목, 작성자 닉네임, 게시글 좋아요 수, 게시글을 좋아요할 수 있는 버튼, 조회수, 작성 날짜, 게시글 내용, 댓글들의 목록이 있다.
댓글은 댓글 작성자 닉네임, 작성 날짜, 내용, 좋아요 수가 표기되어 있다.
##### 프리띵크 수정
프리띵크 수정 페이지는 작성 페이지와 동일함.
##### 프리띵크 삭제
해당 게시글 읽기 페이지에서 작성자는 삭제할 수 있음. 삭제 버튼을 누르면 확인 창을 한 번 띄운 뒤 동의 버튼을 누르면 삭제 진행
##### 핫띵크 읽기, 리얼띵크 읽기, 수정, 삭제
프리띵크와 유사
##### 리얼띵크 구매
해당 게시글 읽기 페이지에서 사용자의 페이지로 들어가게 해서 연락을 취할 지, 댓글을 달게 할지, 댓글을 없앨지
##### 프리띵크 좋아요
해당 게시글 읽기 페이지에서만 좋아요 및 좋아요 취소 가능
##### 프리띵크 댓글달기
##### 댓글 좋아요
##### 회원 팔로우
마이페이지에서는 내가 팔로우한 사람 리스트만 출력
해당 사용자 정보 페이지에서 팔로우 및 팔로우 취소 가능
##### 회원 신고
회원 신고는 해당 게시글, 댓글, 쪽지에서 신고 버튼을 눌러 신고하고
누적 신고가 들어온 회원을 징계처분을 하는 것을 기준.
신고건들은 운영자들이 해당 게시물이나 쪽지를 모니터링
##### 통합 검색
##### 공지 사항
게시판 DB의 타입을 하나 설정하여 조회
##### 내가 쓴 글 확인
마이페이지에서 내가 쓴 글 리스트로 출력
해당 글 클릭 시 해당 글 읽기 페이지로 이동

## 이슈
- 핫띵크 리얼띵크 읽기 권한 막기 없앰
- 회원가입할 때 이메일 인증만 하기로, 휴대폰 인증은 없애는 걸로
- 개인정보에서 휴대폰 번호 있음
- 회원정보 수정할 목록 비밀번호 변경과 닉네임 변경, 휴대폰 번호 변경
- 게시글 삭제 시 바로 삭제
- 작성자가 마이페이지와 게시글 목록에서 자신의 게시글을 수정이나 삭제할 수 있음
- 게시글 삭제는 DB 삭제, QNA는 이메일로 받아서 답변

## 시나리오 구성
- SNS 로그인 시나리오 - 추후 추가
- 휴대폰 인증 시나리오
1. 회원가입할 때 인증을 따로 진행하지 않고, 가입 완료 후 마이페이지에서 휴대폰 인증 진행
2. 유효성검사 실행
3. 비밀번호 찾기 구현
- 리얼띵크 거래 시나리오
1. 판매자(작성자)가 가격을 정하거나 협의가능하게 함
2. 게시글 수정에서 가격을 수정할 수 있게함
3. 쇼핑몰 처럼 포인트로 결제.


==============================
# HotThink 최종 완성 기능
1. 회원가입 / 회원탈퇴
2. 스프링 시큐리티를 이용한 로그인 / 로그아웃
3. footer에서 이동 가능한 기능
-> 이용약관/운영정책/FAQ/ 제작과정
4. 프리/핫/리얼/자유/QNA 게시판의 CRUD
5. 프리/핫 댓글기능 + QNA 댓글(답변) 등록/삭제
6. 프리띵크 게시판 좋아요 기능
->일정 좋아요 개수 달성시 자동으로 '핫띵크'로 이동
7. 댓글에 좋아요 기능
8. 각 게시판의 신고 / 댓글 신고 + 아이디어 표절신고 기능
9.모든 게시판 페이지네이션
10. 모든 게시판 '제목' 기준 검색 기능
11. 메인페이지 (index.html) 통합 검색 기능
12. 회원 팔로우 기능
13. 회원 페이지(회원의 팔로우/쓴 글/ 거래 평점 확인)
14. 마이페이지 (내가 쓴 글/ 팔로우 /쪽지 / 알림)
->포인트충전(카카오페이 + 페이코)
15. 휴대폰 인증 기능
16. PW 찾기 기능(임시 비밀번호 이메일 발송)
17. 리얼띵크 거래 기능
-> 거래 후 판매자 평가 / 거래시 인증된 휴대폰으로 거래 정보 발송 / 완료시 문자 발송
18. 회원 탈퇴시 user의 status 가 1 -> 0 으로 변경
19. 회원정보 수정(pw/닉네임)


# 사용 기술 
-spring boot 
-spring security
-spring kafka
-JPA(JPQL)
-mySQL
-AWS EC2
-AWS RDS
-iamport
-coolSMS
-mustache
-HTML/CSS
-bootstrap / JQUERY


![main](https://user-images.githubusercontent.com/39195377/85849144-63eb9a00-b7e5-11ea-9a27-7d9ad526424c.png)

