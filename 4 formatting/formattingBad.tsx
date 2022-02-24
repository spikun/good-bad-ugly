const Post = (props) => 
{
    return (


<div className="post-container">
    <img className="avatar" src={props.avatar} />
        <div className="post-body">
            {props.body}
        </div>
    <div className="likes">
        {props.likes}
    </div>
    <div className="comments">
        {props.comments.map(comment => 
        (<div className="comment"><div className="comment-avatar">{comment.avatar}</div>
        <div className="comment-body">
            {comment.body}
        </div>
</div>))}</div></div>)}