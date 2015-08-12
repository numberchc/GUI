package thread;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class DrawThread4 extends Thread
{
	// 模拟用户账户
	private Account4 account;
	// 当前取钱线程所希望取的钱数
	private double drawAmount;
	public DrawThread4(String name , Account4 account 
		, double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	// 重复100次执行取钱操作
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++ )
		{
			account.draw(drawAmount);
		}
	}
}
