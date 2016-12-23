# jsr339_restful
restful for java

## 技术
> **servlet 3.0**  <br>
> jsr339 **JAX-RS 2.0**  <br>

项目启动后访问如下路径

### demo1 请求文本数据
*get*:/hello/text
rep:hello world

### demo2请求json数据
*get*:/hello/json
rep:
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


### demo2请求json数据
*get*:/hello/args?name=zhangsan&age=18
rep:
```
{
  code: 200,
  name: "zhangsan",
  age: 18
}
```
