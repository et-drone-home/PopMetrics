# PopMetrics

BOILERPLATE TUTORIAL LINK:
https://medium.com/quick-code/crud-app-using-vue-js-and-django-516edf4e4217

###Setup:
run at project root dir ---->

```
virtualenv venv -p $(which python3)

source venv/bin/activate

```

###Local Run:
```

python manage.py runserver

```

Acceptance Tests:

Given I'm using the Dashboard
Then Im able to read the 3 most recent mentions

Given Im using the Dashboard 
When anther users likes any content
Then users name is displayed in real time

Given Im using Dashboard
Then Im able to view total historic Mentions

Given Im using Dashboard
Then Im able to view total historic Replies

Given Im using Dashboard
Then Im able to view total historic Retweets

Given Im using Dashboard
Then Im able to view total historic Likes