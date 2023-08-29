# naver0829study
네이버 클라우드 과정3 기 수업


git-bash

1. git init - git 과 연동할 폴더 초기화    
2. git remote add origin 원격저장소 https://github.com/jaehyoung119/naver0829study.git - git 원격저장소에 새로 연결  
   오류가 나서 새로운 깃 저장소랑 연결이 안될경우  
   git remote set-url grigin https://github.com/jaehyoung119/naver0829study.git  
3. git brancd - branch 조회  
4. git add . 또는 git add 파일명 : 해당 파일들을 로컬 저장소에 추가  
5. git commit -m 메세지 - 해당 메세지와 함께 위의 파일들을 로컬저장소에 커밋  
6. git push origin master (or main) - 원격저장소의 master 브랜치에 소스 보내기  
    - 반대로 원격 저장소의 수정된 내용을 가져올 경우  
    - git pull origin master (or main)  
처음에 한번만 이메일과 유저명 확인  
git config --global user.name "[김재형]"  
git config --global user.email"[kim0js@naver.com]"  
