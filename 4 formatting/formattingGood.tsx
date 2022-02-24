const Post = ({ avatar, body, likes, comments }) => {
    return (
        <div className="post-container">
            <img className="avatar" src={avatar} />
            <div className="post-body">
                {body}
            </div>
            <div className="likes">
                {likes}
            </div>
            <div className="comments">
                {comments.map(comment => <PostComment {...comment} />)}
            </div>
        </div>
    )
}

const PostComment = ({ avatar, body }) => {
    return (
        <div className="comment">
            <div className="comment-avatar">
                {avatar}
            </div>
            <div className="comment-body">
                {body}
            </div>
        </div>
    )
}