labels:
  - name: Core
    resources:
    - src/app
    branch: r/^core-/
    title: r/^\<.*>\(core\)/
  - name: mobile
    resources:
    - src/android
    - src/ios
    branch: r/^mobile-/
    title: r/^\<.*>\(mobile\)/
