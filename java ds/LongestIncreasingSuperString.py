def f(a):
    n=len(a)
    dp=[0 for i in range(n)]
    print(dp)
    dp[0]=1
    for i in range(1,n):
        max_len=0
        for j in range(0,i):
            if dp[j]>max_len:
                if(a[j]<=a[i]):
                    max_len=max(max_len,dp[j])
        dp[i]=1+max_len
    return dp
    


a=[1,-1,2,-2,3]
print(f(a))