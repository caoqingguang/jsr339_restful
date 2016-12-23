# jsr339_restful
restful for java

## refs
> **servlet 3.0**  <br>
> jsr339 **JAX-RS 2.0**  <br>

<font size=5>如下三个**demo**</font>

### demo1 请求文本数据
*get url*:/hello/text  <br>
rep:hello world

### demo2请求json数据
*get url*:/hello/json  <br>
rep data:
```
{
  code: 200,
  data: [
    1,
    2,
    5
  ]
}
```


### demo3 带参数 请求json数据
*get*:/hello/args?name=zhangsan&age=18  <br>
rep:
```
{
  code: 200,
  name: "zhangsan",
  age: 18
}
```
