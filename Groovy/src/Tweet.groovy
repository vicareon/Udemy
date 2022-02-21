import groovy.transform.ToString
@ToString
class Tweet {
    String name, username, tweet
    int replies, retweets, likes

    void setReplies(int replies){
        this.replies = replies
    }

    void setRetweets(int retweets){
        this.retweets = retweets
    }

    void setLikes(int likes){
        this.likes = likes
    }

    Tweet(name, username, tweet, replies, retweets, likes){
        this.name = name
        this.username = username
        this.tweet = tweet
        setReplies(replies)
        setRetweets(retweets)
        setLikes(likes)
    }
}
