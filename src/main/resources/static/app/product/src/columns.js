define([
    { field: 'productName', title: '名称', sortable: true, halign: 'center' },
    { field: 'factory', title: '所属厂商', sortable: true, halign: 'center', formatter: factoryFormatter },
    { field: 'core', title: '型号', sortable: true, halign: 'center' },
    { field: 'price', title: '单价', sortable: true, halign: 'center' },
    { field: 'total', title: '总数', sortable: true, halign: 'center' },
    { field: 'remake', title: '说明', sortable: true, halign: 'center' },
    { field: 'action', title: '操作', halign: 'center', align: 'center', formatter: actionFormatter, events: 'productNameActionEvents', clickToSelect: false }
]);

function actionFormatter(value, row, index) {
    return [
        '<a class="edit ml10" href="javascript:void(0)" data-toggle="tooltip" title="Edit"><i class="glyphicon glyphicon-edit"></i></a>　',
        '<a class="remove ml10" href="javascript:void(0)" data-toggle="tooltip" title="Remove"><i class="glyphicon glyphicon-remove"></i></a>'
    ].join('');
}

function factoryFormatter(val, row, index) {
    return val.factoryName;
}

