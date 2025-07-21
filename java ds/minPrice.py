def f(price):
    max_profit=0
    n=len(price)
    mini=price[0]
    for i in range(1,n):
        mini=min(mini,price[i])
        max_profit=max(max_profit,price[i]-mini)
        print(max_profit)
    return max_profit

def f1(price,n,start,end):
    max_profit=0
    if start==end:
        return 0
    #i buying day 0 to n-2  j-->selling day i+1 to n-1
    for i in range(start,end):
        for j in range(i+1,end+1):
            if price [j]>price[i]:
                profit=f1(price,n,start,i-1)+price[j]-price[i]+f1(price,n,j+1,end)
                if profit>max_profit:
                    max_profit=profit
    return max_profit 


def f2(price):
    n=len(price)
    dp=[0 for i in range(n)]
    max_profit=0
    for i in range(1,n):
        if price[i]>price[i-1]:
            dp[i]=max(dp[i],dp[i-1]+price[i]-price[i-1])
        else:
            dp[i]=dp[i-1]
    return dp



price=[100,20,260,310,40,535,695]
print(f(price))
print(f1(price,len(price),0,len(price)-1))
print(f2(price)) #dp approach for multiple buys)