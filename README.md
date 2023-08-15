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
  - ### 구매하기 [🔗코드 보기](https://github.com/EllyKimHub/pandang/wiki/%E2%9C%A8-%F0%9F%92%B3%EF%B8%8E-%EA%B5%AC%EB%A7%A4%ED%95%98%EA%B8%B0)
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
| 장바구니 | ![장바구니](https://github.com/EllyKimHub/pandang/assets/123884116/5ada0dd1-3fef-41c9-803a-6daeeffaa5de) | ![장바구니_선택](https://github.com/EllyKimHub/pandang/assets/123884116/d08d36a5-f1cb-4ac2-8194-3d3516ee43fa) 체크박스로 상품 선택 | ![장바구니_최소선택](https://github.com/EllyKimHub/pandang/assets/123884116/20b52321-c439-450c-ab98-2abf5beec7c4) 선택한 상품 없이 구매시 알람 | ![장바구니_비었음](https://github.com/EllyKimHub/pandang/assets/123884116/e54e564e-30b1-4582-8770-ed143bcd3bb1) 장바구니에 담긴 상품 없음 |
| 구매하기 | ![구매하기_회원주소](https://github.com/EllyKimHub/pandang/assets/123884116/6f99b25d-be6f-4a0f-a1c8-5e815e71b8e0) | ![구매하기_새주소](https://github.com/EllyKimHub/pandang/assets/123884116/aaf2ffa9-52d7-433d-acb2-91a5d8e62462) 배송 정보 변경 | ![구매하기_새주소배송지](https://github.com/EllyKimHub/pandang/assets/123884116/5c834fe0-0dbb-4c4c-a8b3-c42e8c2d88dd) 주소API|  |
| 구매내역 | ![구매내역](https://github.com/EllyKimHub/pandang/assets/123884116/5c6c3016-29b2-47b2-8aff-a2f4f76ea2ed) | ![구매내역_반품모달](https://github.com/EllyKimHub/pandang/assets/123884116/f5712953-b14f-4a81-9683-c1dfadd416c3) 반품 신청 모달창 | ![구매내역_버튼비활성](https://github.com/EllyKimHub/pandang/assets/123884116/b517a964-1e6c-47ae-bb48-852a2b321f55) 반품 신청 후 버튼 비활성 | ![구매상품_없음](https://github.com/EllyKimHub/pandang/assets/123884116/ba82ddae-59ac-4982-b91a-b7b189493152) 구매 상품 없음 |
