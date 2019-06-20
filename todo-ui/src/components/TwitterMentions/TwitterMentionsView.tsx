import React from 'react';

interface Props {
  counter: number;
  onDecrementClick: () => void;
  onIncrementClick: () => void;
}

const TwitterMentionsView = ({ counter, onDecrementClick, onIncrementClick }: Props) => (
  <div>
    <div id="mentions">{counter.toString()}</div>
    <button onClick={onDecrementClick}>-</button>
    <button onClick={onIncrementClick}>+</button>
  </div>
);

export default TwitterMentionsView;
