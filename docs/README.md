1. 게임 시작
2. 경주할 자동차 이름 입력받기
3. 시도할 횟수 입력 받기
4. 입력받은 시도 횟수만큼 반복
5. 입력받은 플레이어 이름에 대한 list 크기만큼 hashmap 생성 (이름, 점수)
6. 입력 시도 만큼 반복
   1. 각 플레이어마다 랜덤
   2. 랜덤값이 4이상이면
   3. 점수 +1 >> "-" 추가
7. playgame 의 playerdic 을 PrintWinner에 넘겨주고 
8. '-' 길이 계산 (playerdic -> winnerMap)
9. winnerMap 반복하면서
10. 해당 key에대한 value가 더 크면 기존의 winnerList 다 삭제 후 갱신
11. 같으면 add