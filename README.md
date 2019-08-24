![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/sds100/KeyMapper.svg)
![GitHub Releases Downloads](https://img.shields.io/github/downloads/sds100/keymapper/total.svg?label=GitHub%20Releases%20Downloads)
![GitHub release](https://img.shields.io/github/release/sds100/KeyMapper.svg)


Key Mapper is a free and open source Android app that can map a single or multiple key events to a custom action. The aim of this project is to allow anyone to make any button they use with their Android device do whatever they want.

[XDA Developers thread](https://forum.xda-developers.com/android/apps-games/app-keyboard-button-mapper-t3914005)  



![](app/src/main/res/mipmap-xxhdpi/ic_launcher_round.png?raw=true)
<a href='https://play.google.com/store/apps/details?id=io.github.sds100.keymapper&pcampaignid=MKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1'><img alt='Get it on Google Play' src='https://play.google.com/intl/en_gb/badges/images/generic/en_badge_web_generic.png' height=128px/> </a> <a href='https://t.me/key_mapper'><img alt='Telegram Channel' src='https://telegram.org/img/t_logo.png' height=128px/> </a>

### How do I contribute?
You can help by suggesting ideas, notifying me of any bugs or contributing to the code directly. You can post suggestions and bug fixes by emailing me or posting in the XDA thread, Telegram channel or GitHub issues page for this repo.

To build and help with code stuff...
1. Fork the KeyMapper repository (repo).
2. Clone the repo to your device. It will clone to a folder called KeyMapper by default.
3. [Install](https://developer.android.com/studio/install) Android Studio if you don't have it already. It is available for Windows, Linux and macOS.
4. Open the cloned KeyMapper folder in Android Studio. Install anything Android Studio prompts you to install. E.g the gradle wrapper version used by KeyMapper or older Android SDK versions.
5. Checkout (switch to) the "develop" branch.
6. Make any changes then commit them to your forked repo then make a pull request!

### I need help in the app!
Look at the [help](https://github.com/sds100/KeyMapper/wiki/Help) page in the wiki.

### Translations 🌍
Take a look at the [translations](https://github.com/sds100/KeyMapper/wiki/Translate) page in the wiki. Any translations will be appreciated. 😊

### Branches 🌴
 - master: Everything in the latest stable release.
 - develop: The most recent changes. The app is potentially unstable but it can be successfully compiled. Merges into a release branch when enough has been changed for a new release.

 - release/*: Branched off develop. Beta releases for a particular release are compiled from here. Once the code is stable, it will be merged into master. No big changes should be made/merged here as the purpose of this branch is to make a release stable. By separating upcoming releases from develop, new features can be worked on in develop without affecting the upcoming release's code base.
 - feature/*: Any new changes currently being developed. Merges into develop.
 - hotfix/*: Any small, quick (atleast things which SHOULD be quick) changes that need to be made. Merge into develop and release. If there is no release already being worked on, quickly release a new version depending on how critical the issue is and merge the new release branch into master.

### Versioning
This project uses semantic versioning. e.g 1.2.3-alpha.1

- 1st digit: major release. Only incremented when a big enough change happens to the project.
- 2nd digit: minor releases. Incremented when a new feature or a few are added.
- 3rd digit: patches. Incrememtend after a hotfix or bug fix.

Additional labels can be used as a suffix. e.g "alpha".

#### Version codes
The version code in the develop branch should always be the highest. Therefore, when a new version is released in the release branch, it should be incremented as well.

The README, License, Credits, Changelog and Privacy Policy files should just be changed in the master branch.
