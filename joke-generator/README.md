# joke-generator


# Install Dependencies

```
lein deps
```
# Setup AWS Profile
_Note: requires downloading aws cli._

```
aws configure
```

# Build & Deploy

```shell
$ serverless deploy
```

# Force Redeploy (If Normal Deploy Not Working)

```
$ serverless deploy function -f echo
```

# Invoke Deployed Function

```shell
$ curl -X POST <url> -H 'Content-Type: application/json' -d '{"body": "Hi"}'
```
