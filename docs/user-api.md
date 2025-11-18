# user-api Endpoint List
## User Core Api
### Create User
POST /api/users
- email, name을 입력받아 새 유저 생성
- 테스트를 위해 userId 발급 목적

### Get User by ID
GET /api/users/{id}
- userId 기반 단건 프로필 조회
- BFF에서 홈 화면 구성 시 user 정보 요청에 사용

## System / Observability
### Health Check
GET /actuator/health
- 기본 애플리케이션 상태 확인

### Prometheus Metrics
GET /actuator/prometheus
- 모니터링 및 Grafana 연동을 위한 메트릭 노출