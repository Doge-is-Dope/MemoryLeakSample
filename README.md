# MemoryLeakSample

This sample is referred to my [post on stackoverflow](https://stackoverflow.com/questions/71433551/data-binding-causes-memory-leak-even-the-binding-has-been-nullified).
It can be tracked on [Google IssueTracker](https://issuetracker.google.com/issues/229136453).

## Repro
1. Clone the repo
```
git clone https://github.com/Doge-is-Dope/MemoryLeakSample.git
```
2. Build and run the app on a device or emulator
3. Click the only button in the fragment repeatedly until LeakCanary dumps the memory

## Screenshot
<img src="https://i.stack.imgur.com/L3WcT.gif" width="250"/>


## Update

#### May 12, 2022
- Marked as fixed by Google

#### Apr 16, 2022
- Marked as known issue by LeakCanary in the next release - [pull request](https://github.com/square/leakcanary/pull/2347)

#### Apr 15, 2022
- Filed the issue on [Google IssueTracker](https://issuetracker.google.com/issues/229136453) by the author of LeakCanary

#### Mar 14, 2022
- Filed the issue on [Google IssueTracker](https://issuetracker.google.com/issues/224311803) by me

