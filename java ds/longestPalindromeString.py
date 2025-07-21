def f(s):
    n=len(s)
    dp=[[False for j in range(n) for i in range(n)]]
    length=0
    for gap in range(0,n):
        for i in range(0,n-gap):
            j=i+gap
            if gap==0:
                dp[i][j] = True
            elif gap==1:
                if s[i]==s[j]:
                    dp[i][j] = True
            else:
                if s[i]==s[j] and dp[i+1][j-1]==True:
                    dp[i][j] = True
            if dp[i][j]==True:
                length=1+gap
    return length
s="aabbaaccc"
print(f(s))
