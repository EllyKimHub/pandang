# ✔ 판당
### 소셜미디어 인플루언서의 개인제작상품 판매, 구매하고 팬들과 소통하는 공간  
증가하는 인플루언서의 자체제작 상품을 한 번에 보고 구매할 수 있는 사이트
  
</br>
</br>

# ✔ 팀 구성 
| 구성  | 6인  |  작업 목록  |
| :---: | :---: | :---: |
| 팀장 | 박광인 | 회원가입, 로그인 |
| 부팀장 | 이건희 | 관리자, 게시글 작성 |
| 팀원 | 김덕수 | 판매 기능 |
| **팀원** | **김예슬** | **마이페이지, 구매 기능** |
| 팀원 | 이가은 | SNS 기능 |
| 팀원 | 정연재 | 메인 |  
  
</br>
</br>
  
# ✔ Stacks (JSP Project) 
|   |   |
| :--- | :--- |
| 💻 IDE | ![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)  ![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)  |  
| 📋 Language | ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white) ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)  |
| ⚙️ Framework | ![MyBatis](https://img.shields.io/badge/MyBatis-000000?style=for-the-badge&logo={MyBatis}&logoColor={black}) |
| 📚 Library | ![jQuery](https://img.shields.io/badge/jquery-%230769AD.svg?style=for-the-badge&logo=jquery&logoColor=white) |
| 💾 Database | 	![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white) |
| 🗄️ Server | ![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black) |  
| 📤 Version Control | ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white) ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white) |
  
</br>
</br>

# 작업 목록
  - ### 마이페이지 [🔗코드 보기](https://github.com/EllyKimHub/pandang/wiki/%F0%9F%99%8B%E2%80%8D%E2%99%82%EF%B8%8F-%EB%A7%88%EC%9D%B4%ED%8E%98%EC%9D%B4%EC%A7%80)
1. 회원 정보 받아오기
2. 채널의 이미지 설정하기
3. 주소 API
4. 비밀번호 변경을 원하지 않는 경우 비밀번호 입력 없이 정보 변경 가능하게 하기
5. 변경하기 클릭 시 수정된 회원의 정보 DB에 저장하기
  - ### 장바구니 [🔗코드 보기](https://github.com/EllyKimHub/pandang/wiki/%F0%9F%9B%92-%EC%9E%A5%EB%B0%94%EA%B5%AC%EB%8B%88)
1. 장바구니에 넣은 상품 정보 받아오기
2.  +,- 버튼으로 상품 수량 변경에 따른 상품금액과 총 가격 변화 
3. 상품의 수량 최소 개수가 1 이상의 정수
4.  체크박스 선택하면 총 상품 금액, 총 배송비, 결제 예정금액 계산
5.  체크박스 전체 선택 사용
6.  체크박스 선택으로 상품 삭제 
7.  상품주문 클릭 시 결제하기 페이지로 이동
8.  체크박스가 선택이 안되어있는 경우 구매 페이지로 이동 불가
  - ### 구매하기 [🔗코드 보기](https://github.com/EllyKimHub/pandang/wiki/%F0%9F%92%B3%EF%B8%8E-%EA%B5%AC%EB%A7%A4%ED%95%98%EA%B8%B0)
1. 구매할 상품 정보 받기
2.  결제 API연결
3. 장바구니 페이지에서 각 상품의 수량 받아오기
4. 결제한 상품 정보 DB에 저장
5.  이메일 나눠서 가져오기
6.  회원 정보의 배송정보 받아오고 새로운 배송정보 입력 가능하게 하기
  - ### 구매내역 [🔗코드 보기](https://github.com/EllyKimHub/pandang/wiki/%F0%9F%A7%BE-%EA%B5%AC%EB%A7%A4%EB%82%B4%EC%97%AD)
1. 구매한 상품 정보 받기
2. 한 페이지당 상품 10개씩 띄우고 5단위로 페이지 리스트 정렬
3. 반품버튼을 클릭 시 해당 주문번호에 해당하는 상품 DB에 반품신청 처리
4. 반품버튼을 클릭 시 해당 상품 옆에 반품신청 모달창 띄우기
5. 모달 박스 내에서 반품신청 버튼 누르면 반품신청이 완료됐습니다.가 보이도록 이동처리
  
</br>
</br>

# 구현 화면
|  |  |  |  |  |
| :---: | :---: | :---: | :---: | :---: |
| 마이페이지 | ![screencapture-localhost-8085-member-mypageOk-me-2023-08-02-00_34_56](https://github.com/EllyKimHub/pandang/assets/123884116/c760345e-1f2d-4730-b83b-1a71e4591232) | ![스크린샷(32)2](https://github.com/EllyKimHub/pandang/assets/123884116/4cb8303c-9576-419f-96f2-8b511f545cb7) |  |  |
| 장바구니 | ![screencapture-localhost-8085-basket-basketOk-ba-2023-08-02-00_42_32](https://github.com/EllyKimHub/pandang/assets/123884116/af304625-5dba-4756-99a0-efb63d15fb16) | ![screencapture-localhost-8085-basket-basketOk-ba-2023-08-02-00_43_34](https://github.com/EllyKimHub/pandang/assets/123884116/7bb3f1be-fc6d-46e5-8197-1f932d7e577a) | ![screencapture-localhost-8085-basket-basketOk-ba-2023-08-02-00_57_08](https://github.com/EllyKimHub/pandang/assets/123884116/48dc252e-612a-4ebf-b717-3fc0e1d84cd2)|
| 구매하기 | ![screencapture-localhost-8085-buy-pay-bu-2023-08-02-00_44_49](https://github.com/EllyKimHub/pandang/assets/123884116/6ea5c2ca-48cd-444b-8c94-0479c03be51c) | ![screencapture-localhost-8085-buy-pay-bu-2023-08-02-00_47_49](https://github.com/EllyKimHub/pandang/assets/123884116/80533b25-fba3-4fa8-a6fa-3e5c41d17f9e) | ![스크린샷(34)m](https://github.com/EllyKimHub/pandang/assets/123884116/f9e1eeab-3e1d-4d32-830a-309a8196d1fd) | ![스크린샷(38)m](https://github.com/EllyKimHub/pandang/assets/123884116/610738b8-5a97-42ba-a981-3ba66652b62a) |
| 구매내역 | ![screencapture-localhost-8085-buy-buyListOk-bu-2023-08-02-01_08_00](https://github.com/EllyKimHub/pandang/assets/123884116/38b6c227-088e-4e68-afad-64c22d80d5ff) | ![screencapture-localhost-8085-buy-buyListOk-bu-2023-08-02-01_08_44](https://github.com/EllyKimHub/pandang/assets/123884116/650124b8-d138-4df3-a6fa-bea2f6187cd8) | ![screencapture-localhost-8085-buy-buyListOk-bu-2023-08-02-01_09_02](https://github.com/EllyKimHub/pandang/assets/123884116/185bac69-9e7d-49fa-b97d-83c26cde72fc) | ![screencapture-localhost-8085-buy-buyListOk-bu-2023-08-02-00_57_21](https://github.com/EllyKimHub/pandang/assets/123884116/8ec4cf27-f7d0-4520-a793-29c41b1efc35) |
