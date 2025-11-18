# MSA + BFF Test Project
모노레포 기반 / 로컬 앱 실행 / Docker 기반 인프라 / Prometheus + Grafana 모니터링

## Setup
- pre-commit : 커밋 이전에 `ktlint` 를 통해 점검, 코드 안정성 확보
```shell
make init
```
### Environment
`local` 프로필로 동작할 수 있도록, 필요 인프라를 `docker-compose` 로 제공합니다.
```shell
docker-compose -p msa-bff-lab -f ./docker/infra-compose.yml up -d 
```
### Monitoring
`local` 환경에서 모니터링을 할 수 있도록, `docker-compose` 를 통해 `prometheus` 와 `grafana` 를 제공합니다.

애플리케이션 실행 이후, **http://localhost:9090** 로 접속해, admin/admin 계정으로 로그인하여 확인하실 수 있습니다.
```shell
docker-compose -p msa-bff-lab -f ./docker/monitoring-compose.yml up -d 
```