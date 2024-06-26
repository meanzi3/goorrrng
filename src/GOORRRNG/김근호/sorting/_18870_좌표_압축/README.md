# 18870번: 좌표 압축

### 구분

<p>Sorting</p>

### 설명

<p>수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.</p>

<p>Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다.</p>

<p>X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.</p>

### 입력

<p>첫째 줄에 N이 주어진다.</p>

<p>둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.</p>

### 출력

<p>첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.</p>

### 예시 입력 1

<pre>5
2 4 -10 4 -9</pre>

### 예시 출력 1

<pre>2 3 0 3 1</pre>

### 예시 입력 2

<pre>6
1000 999 1000 999 1000 999</pre>

### 예시 출력 2

<pre>1 0 1 0 1 0</pre>