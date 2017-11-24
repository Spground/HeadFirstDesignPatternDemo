##Command Pattern

该demo使用命令模式，实现了一个多线程执行执行队列中源源不断的不同类型的请求。
- IRequestCommand 命令对象基类
- IClient 产生命令对象的客户端
- IWoker 方法调用者 Invoker
- IHandler 实际请求的接收者

命令模式

> 命令模式将请求封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象，命令模式也支持撤销的操作。


一般来讲命令模式包含：
- Command
- execute()
- Client
- Invoker
- Receiver
- setCommand()

`Client ---setCommand(Command)----> Invoker ---Command.execute()--> Receiver`

要点

 - 封装方法的调用，将请求调用者和请求接收者解耦。
 - 在被解耦的两者之间是能通过命令对象来完成沟通的。命令对象封装了接收者和一个或者一组动作
 - 实际操作的时候，很常见的使用聪明的对象，也就是直接实现了请求，而不是将工作委托给了接收者
 - 命令对象可以用来实现日志和事务系统
 
 
方法调用请求者 Worker 和 方法调用接收者 Handler 解耦了，Worker 不要知道 Handler 的方法细节，他俩通过Command命令对象进行沟通，Worker和Handler只面向Command。
		
换一个角度理解：`Client`应该知道一切细节，比如`Handler`怎么实现，比如`Command`是哪一种Command，因为毕竟它
是所有动作的发起者；因此它负责创建Command和指定对应的Handler是很符合逻辑的；而Worker只是一个被动执行任务的线程或计算单位
它要做的仅仅是接收任务，执行，接收任务，执行。。。

进一步，对于某些提供`API`的`SDK`来讲，它的角色就类似于`Worker`，它为了能达到和`Client`(几乎等同于`Handler`)解耦的目的（毕竟`Client`的需求千奇百怪），`SDK`提供商只是将和自己提供的功能相关的、固定不变的业务逻辑封装到自己的`Worker`里面，然后暴露`ICommand`接口，和`IHandler`接口，然后`Client`去实现它，将自己的需求通过实现SDK给定的接口表达出来。这样`SDK`面对各种各样的`Client`都可以按照既定模式执行自己的流程。

一句话总结：**将不变的地方封装起来，将变化的地方做成接口留给使用者去实现**。
