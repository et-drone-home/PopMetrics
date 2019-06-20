import { defineFeature, loadFeature } from 'jest-cucumber';
import React from 'react';
import TestRenderer from 'react-test-renderer';
import TwitterMentions from '../../components/TwitterMentions';

const feature = loadFeature('./src/features/twitter_metrics.feature');

defineFeature(feature, test => {
    test('showing dashboard mentions', ({ given, when, then }) => {
        let testInstance: TestRenderer.ReactTestInstance;

        given('I\'m using the Dashboard', () => {
            const testRenderer = TestRenderer.create(<TwitterMentions />);
            testInstance = testRenderer.root;
        });

        then('I am able to see a count of Mentions', () => {
            const divInstance = testInstance.findByProps({ id: 'mentions' });
            expect(divInstance.props.children).toBe('1');
        });
    });
});
