import React, { PureComponent } from 'react';
import TwitterMentionsView from './TwitterMentionsView';

interface State {
  counter: number;
}

export default class TwitterMentions extends PureComponent<{}, State> {
  public state = {
    counter: 0,
  };

  public render() {
    const { counter } = this.state;
    return (
      <TwitterMentionsView
        counter={counter}
        onDecrementClick={this.handleDecrementClick}
        onIncrementClick={this.handleIncrementClick}
      />
    );
  }

  private handleDecrementClick = () => {
    this.setState(({ counter }) => ({ counter: counter - 1 }));
  };

  private handleIncrementClick = () => {
    this.setState(({ counter }) => ({ counter: counter + 1 }));
  };
}
