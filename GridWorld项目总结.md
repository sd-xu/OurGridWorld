# GridWorld项目

**目录**

[toc]



## 1. 项目成员

单诗雯 古海龙 吴俊龙 许承灏 徐锶达（按姓氏首字母排序）

## 2. 项目开发时间

2022年9月至2022年10月10日<font color='red'></font>

## 3. 项目具体分工

该项目具体分为**五个部分**，每个部分都由小组一名成员负责该工作。前期**小组全体成员**会一起开会**把握**一个部分的**整体方向**，**具体细节**交由**对应成员**负责落实和完善，若遇到问题则会**小组全体成员共同讨论、求助助教解决**。

## 4. 项目使用技术

1. Git，用于团队成员共同协作完成GridWorld项目具体实现与开发。
2. Junit模块， 用于GridWorld项目每一部分对应实施后的功能测试，保证编写代码工作的高准确性。
3. Ant自动编译工具， 用于项目正常编译运行。

## 5. 项目使用工具及环境 

IDEA，jdk1.8

## 6. 项目部署环境

在Windows10 及 Linux内核版本大于3.0.0的操作系统上均可部署运行。

## 7. 项目各部分具体实现及对应习题解答

详见每个部分对应的代码及文档，文档是对每个part的questions的解答：https://gitee.com/vision-a/OurGridWorld/contributors?ref=master

## 8. 项目参考指引教程

GridWorld AP Computer Science Case Study Student Manual

## 9. 项目五大部分

### Part One

- 实现代码：Part1部分无需要完成的代码
- 解答课后习题：对于Part1的Do you Know问题，小组成员的答案在OurGridWorld中的Part1/Part1.docx中
- 主要工作：
  1. 完成环境的配置并学习使用、掌握相关工具（git,junit,ant）。相关工具的学习报告已上传至开源仓库OurGridWorld（https://gitee.com/vision-a/OurGridWorld/contributors?ref=master）中：Git学习报告，Junit学习报告，Ant学习报告。
  2. 同时小组成员新建了一个PreTest模块，包括：MyAntTest,MyGitTest,MyJunitTes。主要用于本项目的所需技术的测试与学习。

### Part Two

- 实现代码：实现四个bug的变体：CircleBug，DancingBug，SpiralBug，ZshapeBug
- 解答课后习题：对于Part2的Do you Know问题，小组成员的答案在OurGridWorld中的Part2/Part2.docx中
- 主要工作：
  1. 四个bug的变体具体的代码实现在OurGridWorld中的Part2/src中：对于每个变体，小组成员都采用正常的public static void main()方法进行直接的运行，以及采用Junit.Test方法进行测试，Part2的Junit.Test部分仍然是以展示出运行轨迹为测试的效果，其目的是为了更好地判断轨迹是否符合题目要求，故暂未使用断言，在后续Part中使用断言进行测试。

### Part Three

- 实现代码：实现一个Jumper类并对其在不同的情况下进行测试
- 解答课后习题：对于Part3的Do you Know问题，小组成员的答案在OurGridWorld中的Part3/Part3.docx中。
- 主要工作：
  1. Jumper类的具体实现代码在OurGridWorld中的Part3/src中：这个类采用Junit.Test方法进行测试，生成了一个JumperTest测试类，在测试环节中，小组成员列举出根据可能出现的情况在JumperTest类中进行测试，并通过JumperRunner运行查看不同Grid的运行效果。

### Part Four

- 实现代码：实现多个Critter类的子类：BlusterCritter类、ChanmeleonKid类、KingCrab类、QuickCrab类及RockHound类
- 解答课后习题：对于Part4的Do you Know问题，小组成员的答案在OurGridWorld中的Part4/Part4.docx中。
- 主要工作：
  1. 五个子类的实现代码位于Part4/src下。每个类都继承于Critter类或者Crab类，根据手册及要求选择性重写Actor类中有关actor移动的五个函数：getActors()、processActors()、getMoveLocations()、selectMoveLocation()和makeMove()函数。大部分类的实现仅需要修改getActors()、processActors(),有少量类的实现需要额外实现辅助函数来实现某一特定功能。
  2. 五个子类都分别使用Junit.Test方法进行测试。分别位于实现类的同名文件夹下。每个子类都对应有一个后缀为Test的同名测试类。在测试环节中，小组成员通过设置特殊场景来验证每个子类是否实现了特殊功能，通过断言来判断实现代码是否准确无误。同时，在子类同名文件夹下还有以Runner为后缀的用于运行查看Grid运行效果的类。

### Part Five

- 实现代码：按要求实现BoundedGrid和UnBoundedGrid的变体：SparseBoundedGrid、SparseBoundedGrid2、SparseBoundedGrid3、UnBoundedGrid2
- 解答课后习题：对于Part5的Do you Know问题，小组成员的答案在OurGridWorld中的Part5/Part5.docx中。
- 主要工作：
  1. 具体的代码实现都在Part 5/src下。每个类采用Junit.Test方法进行测试，各有一个测试类，通过断言进行测试。通过SparseGridRunner运行查看不同Grid的运行效果。

## 10.项目总结

​		首先，小组成员在本次项目中通过每周线下固定一次开会、线上秉承“有疑即商量，有需即讨论”的原则不定期开会的高频沟通、交流达成了快速磨合的目的，也在交流学习中了解到彼此的知识掌握程度及任务完成情况。这对于我们小组后续开展第二个项目的协同开发奠定了重要的合作、沟通交流基础。

​		其次，在本次项目的开发中，小组成员在阅读手册、阅读框架源代码的过程中，再次巩固了JAVA的程序设计基础，每位小组成员都独立、自主地完成代码编写任务，并且在小组会议上分享这个过程收获到的知识及遇到的困难，在沟通交流中，大家对技术的认识也更加深入。因为小组成员的严谨、认真及细致的态度，也同时有赖于助教学长的指导和反馈，本次项目顺利结项，过程中并没有遇到太大的问题。







