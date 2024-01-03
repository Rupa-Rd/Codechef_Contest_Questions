# Question: https://www.codechef.com/START114D/problems/CHRISCANDY

T = int(input())
while T != 0:
  n = int(input())
  friend_list = list(map(int,input().split(' ')))[:n]
  visited = set()
   
  for i in range(n):
    for j in range(i+1,n):
      if friend_list[j] < friend_list[i] and friend_list[j] not in visited:
        visited.append(friend_list[j])
     
  print(len(visited))
  T -= 1