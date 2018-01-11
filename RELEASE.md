# Performing a release

This is my cheat sheet for doing a release.

## Do the release

    mvn release:clean release:prepare release:perform

## Maven Central

Head over to http://oss.sonatype.org/ and do the release.

## Update the master branch

    git checkout master
    git merge <tag>
    git push origin
    git checkout develop

## Upload the documentation

    git checkout <tag>
    # prepare and maybe modify site.xml
    mvn site:site site:stage
    cd target/staging
    # upload, upload p2
    git checkout develop

